package pdfcreator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class pdfactemra {
	public static final String[] IMAGES = {
		
//		C:\Users\Marwin\Desktop\projects\accesssolution-automation\accesssolution\Screenshots\desktop
		//desktop
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-0.0.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-1.0.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-1.0-tab1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-1.0-tab2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-1.0-GATCF-1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-1.0-GATCF-2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-1.0-step1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-1.0-step2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-1.0-step3.png",
		
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-2.0.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-2.0-more-info-1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-2.0-more-info-2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-2.0-esubmit.png",
		
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-3.0.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-3.0-tab1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-3.0-tab2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-3.0-tab3.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-3.0-tab4.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-3.0-tab5.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-3.0-tab6.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-3.0-tab7.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-3.0-tab8.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-3.0-tab9.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-3.0-tab10.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-3.0-tab11.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-3.0-tab12.png",
		
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-pat-part1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-pat-part2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-pat-part3.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-pat-more-info-1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-pat-more-info-2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-pat-more-info-3.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-pat-more-info-4.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-pat-1-part1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-pat-1-part2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-pat-2-part1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-pat-2-part2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-pat-3-part1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-pat-3-part2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-pat-4.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-search.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/accesssolutions-patient-actemra-site-map.png"
	
		// mobile
	};
	public static final String DEST = "C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/pdfactemra.pdf";
	 
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
