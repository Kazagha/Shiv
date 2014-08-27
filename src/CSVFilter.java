import java.io.File;

import javax.swing.filechooser.FileFilter;

public class CSVFilter extends FileFilter {

	public CSVFilter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean accept(File f) {
		if (f.isDirectory())
		{
			return true;
		}
		
		String nameString = f.getName();
		int lastIndexOf = nameString.lastIndexOf(".");
		String extensionString = null;
		
		// Check that a file extension exists
		if(lastIndexOf > 0)
		{
			extensionString = nameString.substring(lastIndexOf);
		}
				
		if (extensionString != null)
			if (extensionString.equalsIgnoreCase(".csv"))
			{
				return true;
			} 
		
		return false;
	}

	@Override
	public String getDescription() {
		return "CSV (Comma delimited)";
	}
}
