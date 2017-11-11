package pdfcreator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class pdftecentriq {
	public static final String[] IMAGES = {
		
		//desktop
		
	
		// mobile
	};
	public static final String DEST = "C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/pdfhemlibra.pdf";
	 
    public static void main(String[] args) throws MalformedURLException, IOException, DocumentException{
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new pdfHelibra().createPdf(DEST);
    }
    public void createPdf(String dest) throws MalformedURLException, IOException, DocumentException{
        Image img = Image.getInstance(IMAGES[0]);
        Document document = new Document(img);
        PdfWriter.getInstance(document, new FileOutputStream(dest));
        document.open();
        for (String image : IMAGES) {
            img = Image.getInstance(image);
            document.setPageSize(img);
            document.newPage();
            img.setAbsolutePosition(0, 0);
            document.add(img);
        }
        document.close();
    }
}
