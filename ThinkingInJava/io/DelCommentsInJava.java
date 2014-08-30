import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Insunny
 * 
 */
public class DelCommentsInJava {

	private static final char MARK = '"';

	private static final char SLASH = '/';

	private static final char BACKSLASH = '\\';

	private static final char STAR = '*';

	private static final char NEWLINE = '\n';
	
	//����
	private static final int TYPE_MARK = 1;
	
	//б��
	private static final int TYPE_SLASH = 2;
	
	//��б��
	private static final int TYPE_BACKSLASH = 3;
	
	//�Ǻ�
	private static final int TYPE_STAR = 4;

	// ˫б�����͵�ע��
	private static final int TYPE_DSLASH = 5;

	/**
	 * ɾ��char[]������_startλ�õ�_endλ�õ�Ԫ��
	 * 
	 * @param _target
	 * @param _start
	 * @param _end
	 * @return
	 */
	public static char[] del(char[] _target, int _start, int _end) {
		char[] tmp = new char[_target.length - (_end - _start + 1)];
		System.arraycopy(_target, 0, tmp, 0, _start);
		System.arraycopy(_target, _end + 1, tmp, _start, _target.length - _end
				- 1);
		return tmp;
	}

	/**
	 * ɾ�������е�ע��
	 * 
	 * @param _target
	 * @return
	 */
	public static String delComments(String _target) {
		int preType = 0;
		int mark = -1, cur = -1, token = -1;
		// �����ַ���
		char[] input =  _target.toCharArray();
		for (cur = 0; cur < input.length; cur++) {
			if (input[cur] == MARK) {
				// �����ж��Ƿ�Ϊת������
				if (preType == TYPE_BACKSLASH)
					continue;
				// �Ѿ���������֮��
				if (mark > 0) {
					// ���Ž���
					mark = -1;
				} else {
					mark = cur;
				}
				preType = TYPE_MARK;
			} else if (input[cur] == SLASH) {
				// ��ǰλ�ô�������֮��
				if (mark > 0)
					continue;
				// ���ǰһλ��*�������ɾ������
				if (preType == TYPE_STAR) {
					input = del(input, token, cur);
					// �˻�һ��λ�ý��д���
					cur = token - 1;
					preType = 0;
				} else if (preType == TYPE_SLASH) {
					token = cur - 1;
					preType = TYPE_DSLASH;
				} else {
					preType = TYPE_SLASH;
				}
			} else if (input[cur] == BACKSLASH) {
				preType = TYPE_BACKSLASH;
			} else if (input[cur] == STAR) {
				// ��ǰλ�ô�������֮��
				if (mark > 0)
					continue;
				// ���ǰһ��λ����/,���¼ע�Ϳ�ʼ��λ��
				if (preType == TYPE_SLASH) {
					token = cur - 1;
				}
				preType = TYPE_STAR;
			} else if(input[cur] == NEWLINE)
			{
				if(preType == TYPE_DSLASH)
				{
					input = del(input, token, cur);
					// �˻�һ��λ�ý��д���
					cur = token - 1;
					preType = 0;
				}
			}

		}
		return new String(input);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			File file = new File("./src/Test.java");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			StringBuilder content = new StringBuilder();
			String tmp = null;
			while ((tmp = reader.readLine()) != null) {
				content.append(tmp);
				content.append("\n");
			}
			String target = content.toString();
			//System.out.println(delComments(target));
			reader.close();
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(delComments(target));
			writer.close();
		} catch (Exception e) {

		}
	}

}