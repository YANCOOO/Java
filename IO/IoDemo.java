package IO;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class IoDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File file = new File("H:\\IO");
//		String aString  = file.getName();
//		System.out.println(aString);

//		File file1 = new File("a.txt");
//		String aString = file1.getAbsolutePath();
//		System.out.println(aString);

		File file = new File("F:\\YYS\\abc");
//		boolean b = file.isDirectory();
//		boolean a = file.isFile();
//		System.out.println(b);
//		System.out.println(a);
//		String[] aStrings = file.list();
//		File[] c = file.listFiles();
//		for (File a : c) {
//			System.out.println(a);
//		}
		// 创建文件
//		file.createNewFile();
		YuluoXia(file);

	}

	public static void YuluoXia(File file) {

//		// FileFilter过滤器
//		File[] fileG = file.listFiles(new GuoLvQi());
//
//		for (File file2 : fileG) {
//			if (file2.isDirectory()) {
//				YuluoXia(file2);
//			} else {
//				System.out.println(file2);
//			}
//		}
		
		// FilenameFilter()过滤器、匿名内部类
//		File[] files = file.listFiles(new FilenameFilter() {
//			@Override
//			public boolean accept(File dir, String name) {
//				// TODO Auto-generated method stub
//				return dir.isDirectory() ||dir.getName().toLowerCase().endsWith(".txt");
//			}
//		}); 
		
		//FilenameFilter()过滤器、Lambda表达式
		File[] files = file.listFiles((dir,  name) -> new File(dir,  name).isDirectory() ||dir.getName().toLowerCase().endsWith(".txt"));
		
		for (File file2 : files) {
			if (file2.isDirectory()) {
				YuluoXia(file2);
			} else {
				System.out.println(file2);
			}
		}
	}

}
