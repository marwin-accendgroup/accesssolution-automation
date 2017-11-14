package pdfcreator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class pdfhemlibra {
	public static final String[] IMAGES = {
		
		//desktopC
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-0.0.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-1.0.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-1.0-GATCF-1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-1.0-GATCF-2.png",
	
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-1.0-step1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-1.0-step2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-1.0-step3.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-2.0.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-2.0-more-info-1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-2.0-more-info-2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-2.0-esubmit.png",
		
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-3.0.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-3.0-tab1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-3.0-tab2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-3.0-tab3.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-3.0-tab4.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-3.0-tab5.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-3.0-tab6.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-3.0-tab7.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-3.0-tab8.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-3.0-tab9.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-3.0-tab10.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-3.0-tab11.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-3.0-tab12.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-pat-part1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-pat-part2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-pat-more-info-1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-pat-more-info-2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-pat-1-part1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-pat-1-part2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-pat-2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-pat-3-part1.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-pat-3-part2.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-search.png",
		"C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/hemlibra/accesssolutions-patient-hemlibra-sitemap.png"
		
		// mobile
	};
	public static final String DEST = "C:/Users/Marwin/Desktop/projects/accesssolution-automation/accesssolution/Screenshots/desktop/es/pdf/pdfhemlibra.pdf";
	 
    public static void main() throws MalformedURLException, IOException, DocumentException{
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new pdfhemlibra().createPdf(DEST);
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
