package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\abc\\a.txt");
		fileOutputStream.write(97);
		//สอทลืสิด
		fileOutputStream.close();
	}

}
