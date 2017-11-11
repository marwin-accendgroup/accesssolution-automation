package AccessSolution;

import org.openqa.selenium.WebDriver;

import accesssolutionEs.es_alecensa;
import accesssolutionEs.es_actemra;
import accesssolutionEs.es_avastin;
import accesssolutionEs.es_cotellic;
import accesssolutionEs.es_erivedge;
import accesssolutionEs.es_esbriet;
import accesssolutionEs.es_gazyva;
import accesssolutionEs.es_hemlibra;
import accesssolutionEs.es_herceptin;
import accesssolutionEs.es_kadcyla;
import accesssolutionEs.es_lucentis;
import accesssolutionEs.es_ocrevus;
import accesssolutionEs.es_patient;
import accesssolutionEs.es_perjeta;
import accesssolutionEs.es_pulmozyme;
import accesssolutionEs.es_rituxan_gpampa;
import accesssolutionEs.es_rituxan_nhl_cll;
import accesssolutionEs.es_rituxan_ra;
import accesssolutionEs.es_rituxanhycela;
import accesssolutionEs.es_tarceva;
import accesssolutionEs.es_tecentriq;
import accesssolutionEs.es_venclexta;
import accesssolutionEs.es_xolair;
import accesssolutionEs.es_zelboraf;

public class desktop_es {
	public static void main(String[] args, WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//	---> ES <---
		es_patient.main(args, driver);			// |	11 	 |	 12   |
		es_actemra.main(args, driver);			// |	42	 |	 35	  |
		es_alecensa.main(args, driver);			// |	37	 |   32	  |
		es_avastin.main(args, driver);			// |	41	 |	 36	  |
		es_cotellic.main(args, driver);			// |	37	 |	 32   |
		es_erivedge.main(args, driver);			// |	37	 |	 39	  |
		es_esbriet.main(args, driver); 			// |	37	 |	 41   |
		es_gazyva.main(args, driver); 			// |	37	 |	 39	  |
		es_hemlibra.main(args, driver); 		// |	35	 |	 38   |
		es_herceptin.main(args, driver);		// |	37	 |	 39   |
		es_kadcyla.main(args, driver); 			// |	36	 |	 38   |
		es_lucentis.main(args, driver); 		// |	40	 |	 42	  |
		es_ocrevus.main(args, driver); 			// |	36	 |	 32	  |
		es_perjeta.main(args, driver); 			// |	36	 | 	 38	  |
		es_pulmozyme.main(args, driver); 		// |	38	 |	 43	  |
		es_rituxan_ra.main(args, driver); 		// |	36	 |	 38	  |
		es_rituxan_gpampa.main(args, driver); 	// |	37	 |	 39	  |
		es_rituxan_nhl_cll.main(args, driver); 	// |	37	 |	 39	  |
		es_rituxanhycela.main(args, driver);	// | 	38	 |	 40	  |
		es_tarceva.main(args, driver); 			// |	38	 |	 40	  |
		es_tecentriq.main(args, driver); 		// |	37	 |	 39	  |
		es_venclexta.main(args, driver); 		// |	34	 |	 37	  |
		es_xolair.main(args, driver); 			// |	35	 |	 41	  |
		es_zelboraf.main(args, driver);    		// |	36	 |	 39	  |
	
	}
}
