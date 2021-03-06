package pdfcreator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class pdfpatient {
	public static final String[] IMAGES = {
		
		//desktop
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/patient/accesssolutions-patient-0.0.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/patient/accesssolutions-patient-product-popup.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/patient/accesssolutions-patient-rituxan-popup.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/patient/accesssolutions-patient-biooncology.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/patient/accesssolutions-patient-rheumatology.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/patient/accesssolutions-patient-pan.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/patient/accesssolutions-patient-pan-popup-1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/patient/accesssolutions-patient-pan-popup-2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/patient/accesssolutions-patient-pan-popup-3.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/patient/accesssolutions-patient-contact-us.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/patient/accesssolutions-patient-search.png"
		
	
		// mobile
	};
	public static final String DEST = "C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/pdf/pdfpatient.pdf";
	 
    public static void main() throws MalformedURLException, IOException, DocumentException{
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new pdfpatient().createPdf(DEST);
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
