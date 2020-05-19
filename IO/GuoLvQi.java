package IO;

import java.io.File;
import java.io.FileFilter;

public class GuoLvQi implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		return pathname.isDirectory() ||pathname.getName().toLowerCase().endsWith(".txt");
	}

}
