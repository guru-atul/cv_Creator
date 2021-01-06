package com.cv.cvWriter;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.cv.data.InfoData;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

public class cvWriter1 {

	
	public static int getWrite(List<InfoData> data,String filename) throws Exception {
		int i=0;
		
		if(data.isEmpty()) {
			i=0;
		System.out.println("Data is not available at writer.");	
		}
		else {
			InfoData writerData=new InfoData();
			Iterator<InfoData> it=data.iterator();
			
			while(it.hasNext()) {
				Object o=(Object)it.next();
				InfoData in=(InfoData)o;
/*				System.out.println("candidateName at cvwriter: "+in.getName());
*/				writerData=in;
				}
			
			
			int num=generatePin();
			String dest="C:\\Users\\DELL\\Downloads\\cv_Creater\\"+filename+".pdf";
						
			
			PdfWriter w=new PdfWriter(dest);
			PdfDocument pdoc=new PdfDocument(w);
		    PdfFont font=PdfFontFactory.createFont(FontConstants.TIMES_BOLD);	
		    PdfFont font1=PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);	
			
		    Document doc = new Document(pdoc);
		     
		   
		    
			//Name.
			String name_str=writerData.getName();
			Paragraph name=new Paragraph(name_str);
			name.setFont(font);
			name.setFontSize(18);
			doc.add(name);
		
			String no_str="Mobile: "+writerData.getPhone()+"\n"+"Email: "+writerData.getEmail()+"\n"+"Address: "+writerData.getAddress();
			Paragraph no=new Paragraph(no_str);
			no.setFont(font1);
			no.setFontSize(10);
			doc.add(no);
			
			Paragraph space0=new Paragraph(" ");
			doc.add(space0);
			
			
			//objective
		    float[] objheadWidth={500f};
		    Table objHead=new Table(objheadWidth);
			Cell heading1=new Cell();
			heading1.add("OBJECTIVE");
			heading1.setBackgroundColor(Color.DARK_GRAY);
			heading1.setFont(font);
			heading1.setFontSize(12);
			heading1.setBorder(Border.NO_BORDER);
			heading1.setFontColor(Color.WHITE);
			objHead.addCell(heading1);
			doc.add(objHead);
		    
			String objective=writerData.getObj();
			Paragraph paragraph=new Paragraph(objective);
			paragraph.setFont(font1);
			paragraph.setFontSize(10);
			doc.add(paragraph);
			
			doc.add(space0);
			
			//Educational Details.
			float[] eduheadWidth={500f};
		    Table eduHead=new Table(eduheadWidth);
			Cell heading2=new Cell();
			heading2.add("EDUCATIONAL DETAILS");
			heading2.setBackgroundColor(Color.DARK_GRAY);
			heading2.setFont(font);
			heading2.setFontSize(12);
			heading2.setBorder(Border.NO_BORDER);
			heading2.setFontColor(Color.WHITE);
			eduHead.addCell(heading2);
			doc.add(eduHead);
		   
			String space=" ";
			Paragraph paragraph1=new Paragraph(space);
			doc.add(paragraph1);
			
			float[] colwidth={125f,125f,125f,125f};
			
			Table t=new Table(colwidth);
		    t.setTextAlignment(TextAlignment.CENTER);
			
		    Cell c=new Cell();
			c.add("Dgree/Course");
			c.setFont(font);
			c.setBackgroundColor(Color.GRAY);
			c.setFontSize(12);
		    t.addCell(c);
		   	
		    Cell c1=new Cell();
			c1.add("Institution");
			c1.setFont(font);
			c1.setBackgroundColor(Color.GRAY);
			c1.setFontSize(12);
			t.addCell(c1);
		   
		    Cell c2=new Cell();
			c2.add("Year of Passing");
			c2.setFont(font);
			c2.setFontSize(12);
			c2.setBackgroundColor(Color.GRAY);
			t.addCell(c2);
		   
			
		    Cell c3=new Cell();
			c3.add("Pecentage");
			c3.setFont(font);
			c3.setFontSize(12);
		    c3.setBackgroundColor(Color.GRAY);
			t.addCell(c3);
		   
			
			Cell c4=new Cell();
			c4.add("10th");
			c4.setFont(font1);
			t.addCell(c4);
		   	
			
			
		    Cell c5=new Cell();
			c5.add(writerData.getSsc_ins());
			c5.setFont(font1);
			t.addCell(c5);
		   
		    Cell c6=new Cell();
			c6.add(writerData.getSsc());
			c6.setFont(font1);
			t.addCell(c6);
		   
			
		    Cell c7=new Cell();
			c7.add(writerData.getSsc_per()+"%");
			c7.setFont(font1);
			t.addCell(c7);
		   
			
			Cell c8=new Cell();
			c8.add("12th");
			c8.setFont(font1);
			t.addCell(c8);
		   	
		    Cell c9=new Cell();
			c9.add(writerData.getHsc_ins());
			c9.setFont(font1);
			t.addCell(c9);
		   
		    Cell c10=new Cell();
			c10.add(writerData.getHsc());
			c10.setFont(font1);
			t.addCell(c10);
		   
			
		    Cell c11=new Cell();
			c11.add(writerData.getHsc_per()+"%");
			c11.setFont(font1);
			t.addCell(c11);
			
			Cell c12=new Cell();
			c12.add(writerData.getDgree_name());
			c12.setFont(font1);
			t.addCell(c12);
		   	
		    Cell c13=new Cell();
			c13.add(writerData.getDgree_ins());
			c13.setFont(font1);
			t.addCell(c13);
		   
		    Cell c14=new Cell();
			c14.add(writerData.getDgree());
			c14.setFont(font1);
			t.addCell(c14);
		   
			
		    Cell c15=new Cell();
			c15.add(writerData.getDgree_per());
			c15.setFont(font1);
			t.addCell(c15);
		   
			doc.add(t);
			
			doc.add(space0);
			
			
			float[] proheadWidth={500f};
		    Table proHead=new Table(proheadWidth);
			Cell heading3=new Cell();
			heading3.add("PROJECT DETAILS");
			heading3.setBackgroundColor(Color.DARK_GRAY);
			heading3.setFont(font);
			heading3.setFontSize(12);
			heading3.setBorder(Border.NO_BORDER);
			heading3.setFontColor(Color.WHITE);
			proHead.addCell(heading3);
			doc.add(proHead);
		   
			doc.add(space0);
			
			float[] prodetailWidth= {63f,20f,365f};
			Table proDetails=new Table(prodetailWidth);
			Cell proDetailCell1=new Cell();
			proDetailCell1.add("Title ");
			proDetailCell1.setFont(font);
			proDetailCell1.setFontSize(11);
			proDetailCell1.setBorder(Border.NO_BORDER);
			proDetails.addCell(proDetailCell1);
			
			
			Cell proDetailsSpace=new Cell();
			proDetailsSpace.add("  ");
			proDetailsSpace.setFont(font);
			proDetailsSpace.setFontSize(11);
			proDetailsSpace.setBorder(Border.NO_BORDER);
			proDetails.addCell(proDetailsSpace);
			
			
			Cell proDetailCell2=new Cell();
			proDetailCell2.add(writerData.getP1name());
			proDetailCell2.setFont(font1);
			proDetailCell2.setFontSize(10);
			proDetailCell2.setBorder(Border.NO_BORDER);
			proDetails.addCell(proDetailCell2);
			
			Cell proDetailCell5=new Cell();
			proDetailCell5.add("Duration");
			proDetailCell5.setFont(font);
			proDetailCell5.setFontSize(11);
			proDetailCell5.setBorder(Border.NO_BORDER);
			proDetails.addCell(proDetailCell5);
			
			proDetails.addCell(proDetailsSpace);
			
			Cell proDetailCell6=new Cell();
			proDetailCell6.add(writerData.getP1time()+" Month");
			proDetailCell6.setFont(font1);
			proDetailCell6.setFontSize(10);
			proDetailCell6.setBorder(Border.NO_BORDER);
			proDetails.addCell(proDetailCell6);
			
			
			Cell proDetailCell3=new Cell();
			proDetailCell3.add("Description");
			proDetailCell3.setFont(font);
			proDetailCell3.setFontSize(11);
			proDetailCell3.setBorder(Border.NO_BORDER);
			proDetails.addCell(proDetailCell3);
			
			proDetails.addCell(proDetailsSpace);
			
			Cell proDetailCell4=new Cell();
			proDetailCell4.add(writerData.getP1desc());
			proDetailCell4.setFont(font1);
			proDetailCell4.setFontSize(10);
			proDetailCell4.setBorder(Border.NO_BORDER);
			proDetails.addCell(proDetailCell4);
			
			doc.add(space0);
			
			int count=1;
			
			if(writerData.getP2name().isEmpty()) {
				System.out.println(writerData.getP2name());
				count=0;
			}
			
			
			if(count>0) {
				doc.add(space0);
				doc.add(space0);
				
				Cell pro1DetailCell1=new Cell();
				pro1DetailCell1.add("Title ");
				pro1DetailCell1.setFont(font);
				pro1DetailCell1.setFontSize(11);
				pro1DetailCell1.setBorder(Border.NO_BORDER);
				proDetails.addCell(pro1DetailCell1);
				
				
				Cell pro1DetailsSpace=new Cell();
				pro1DetailsSpace.add("  ");
				pro1DetailsSpace.setFont(font);
				pro1DetailsSpace.setFontSize(11);
				pro1DetailsSpace.setBorder(Border.NO_BORDER);
				proDetails.addCell(pro1DetailsSpace);
				
				
				Cell pro1DetailCell2=new Cell();
				pro1DetailCell2.add(writerData.getP2name());
				pro1DetailCell2.setFont(font1);
				pro1DetailCell2.setFontSize(10);
				pro1DetailCell2.setBorder(Border.NO_BORDER);
				proDetails.addCell(pro1DetailCell2);
				
				Cell pro1DetailCell5=new Cell();
				pro1DetailCell5.add("Duration");
				pro1DetailCell5.setFont(font);
				pro1DetailCell5.setFontSize(11);
				pro1DetailCell5.setBorder(Border.NO_BORDER);
				proDetails.addCell(pro1DetailCell5);
				
				proDetails.addCell(proDetailsSpace);
				
				Cell pro1DetailCell6=new Cell();
				pro1DetailCell6.add(writerData.getP2time()+" Month");
				pro1DetailCell6.setFont(font1);
				pro1DetailCell6.setFontSize(10);
				pro1DetailCell6.setBorder(Border.NO_BORDER);
				proDetails.addCell(pro1DetailCell6);
				
				
				Cell pro1DetailCell3=new Cell();
				pro1DetailCell3.add("Description");
				pro1DetailCell3.setFont(font);
				pro1DetailCell3.setFontSize(11);
				pro1DetailCell3.setBorder(Border.NO_BORDER);
				proDetails.addCell(pro1DetailCell3);
				
				proDetails.addCell(proDetailsSpace);
				
				Cell pro1DetailCell4=new Cell();
				pro1DetailCell4.add(writerData.getP2desc());
				pro1DetailCell4.setFont(font1);
				pro1DetailCell4.setFontSize(10);
				pro1DetailCell4.setBorder(Border.NO_BORDER);
				proDetails.addCell(pro1DetailCell4);
					
				doc.add(proDetails);
				
				doc.add(space0);
			}
			else {
				doc.add(proDetails);
			  doc.add(space0);		
			}
			
			
			float[] skillHeadWidth= {500f};
			Table skillHead=new Table(skillHeadWidth);
			Cell skillHeadCell=new Cell();
			skillHeadCell.add("SKILLS");
			skillHeadCell.setBackgroundColor(Color.DARK_GRAY);
			skillHeadCell.setFont(font);
			skillHeadCell.setFontColor(Color.WHITE);
			skillHeadCell.setFontSize(12);
			skillHeadCell.setBorder(Border.NO_BORDER);
			skillHead.addCell(skillHeadCell);
			 doc.add(skillHead);
			 
			 doc.add(space0);
			 
			 String s1=writerData.getS2();
			 String s2=writerData.getS3();
			 String s3=writerData.getS4();
			 String s4=writerData.getS5();
			 String s5=writerData.getS6();
			 String s6=writerData.getS7();
			 String s7=writerData.getS8();
			 String s8=writerData.getS9();
			 String s9=writerData.getS10();
					 
			 
			 
			 com.itextpdf.layout.element.List skilList=new com.itextpdf.layout.element.List();
			 skilList.setFont(font1);
			 skilList.setFontSize(11);
			 
			 skilList.add(writerData.getS1());
			 
			
			 
			 if(!s1.isEmpty()) {
			 skilList.add(s1); 
			 }
			 
			 if(!s2.isEmpty()) {
				 skilList.add(s2); 
				 }
			 
			 if(!s3.isEmpty()) {
					 skilList.add(s3); 
				 }
			 
			 if(!s4.isEmpty()) {
					 skilList.add(s4); 
				 }
			 
			 if(!s5.isEmpty()) {
				 skilList.add(s5); 
				 }
				 
			 if(!s6.isEmpty()) {
				 skilList.add(s6); 
				 }
				 
			 if(!s7.isEmpty()) {
				 skilList.add(s7); 
				 }
				 
			 if(!s8.isEmpty()) {
				 skilList.add(s8); 
				 }
			 
			 if(!s9.isEmpty()) {
				 skilList.add(s9); 
				 }
				 
				 
			 
			 doc.add(skilList);
			 
			 doc.add(space0);
			
			 
			    float[] insHeadWidth= {500f};
				Table insHead=new Table(insHeadWidth);
				Cell insHeadCell=new Cell();
				insHeadCell.add("INDUSTRIAL EXPOSURE");
				insHeadCell.setBackgroundColor(Color.DARK_GRAY);
				insHeadCell.setFont(font);
				insHeadCell.setFontColor(Color.WHITE);
				insHeadCell.setFontSize(12);
				insHeadCell.setBorder(Border.NO_BORDER);
				insHead.addCell(insHeadCell);
				 doc.add(insHead);
				 
				 doc.add(space0);
				 
				 
					float[] insdetailWidth= {75f,40f,365f};
					Table insDetails=new Table(insdetailWidth);
					Cell insDetailCell1=new Cell();
					insDetailCell1.add("Training");
					insDetailCell1.setFont(font);
					insDetailCell1.setFontSize(11);
					insDetailCell1.setBorder(Border.NO_BORDER);
					insDetails.addCell(insDetailCell1);
					
					
					Cell insDetailsSpace=new Cell();
					insDetailsSpace.add("  ");
					insDetailsSpace.setFont(font);
					insDetailsSpace.setFontSize(11);
				    insDetailsSpace.setBorder(Border.NO_BORDER);
					
				    insDetails.addCell(insDetailsSpace);
					
					
					Cell insDetailCell2=new Cell();
					insDetailCell2.add(writerData.getT1name());
					insDetailCell2.setFont(font1);
					insDetailCell2.setFontSize(10);
					insDetailCell2.setBorder(Border.NO_BORDER);
					insDetails.addCell(insDetailCell2);
					
					Cell insDetailCell5=new Cell();
					insDetailCell5.add("Institution");
					insDetailCell5.setFont(font);
					insDetailCell5.setFontSize(11);
					insDetailCell5.setBorder(Border.NO_BORDER);
					insDetails.addCell(insDetailCell5);
					
					insDetails.addCell(insDetailsSpace);
					
					Cell insDetailCell6=new Cell();
					insDetailCell6.add(writerData.getT1_ins());
					insDetailCell6.setFont(font1);
					insDetailCell6.setFontSize(10);
					insDetailCell6.setBorder(Border.NO_BORDER);
					insDetails.addCell(insDetailCell6);
					
					
					Cell insDetailCell3=new Cell();
					insDetailCell3.add("Description");
					insDetailCell3.setFont(font);
					insDetailCell3.setFontSize(11);
					insDetailCell3.setBorder(Border.NO_BORDER);
					insDetails.addCell(insDetailCell3);
					
					insDetails.addCell(insDetailsSpace);
					
					Cell insDetailCell4=new Cell();
					insDetailCell4.add(writerData.getT1desc());
					insDetailCell4.setFont(font1);
					insDetailCell4.setFontSize(10);
					insDetailCell4.setBorder(Border.NO_BORDER);
					insDetails.addCell(insDetailCell4);
				
				     	doc.add(insDetails);
					    doc.add(space0);
				     	
				int count1=0;
				if(!writerData.getT2name().isEmpty()) {
					count1++;
				}
				
				if(count1>0) {
				    float[] ins1detailWidth= {75f,40f,365f};
					Table ins1Details=new Table(ins1detailWidth);
					
				    Cell ins1DetailCell1=new Cell();
					ins1DetailCell1.add("Training");
					ins1DetailCell1.setFont(font);
					ins1DetailCell1.setFontSize(11);
					ins1DetailCell1.setBorder(Border.NO_BORDER);
					ins1Details.addCell(ins1DetailCell1);
					
					
					Cell ins1DetailsSpace=new Cell();
					ins1DetailsSpace.add("  ");
					ins1DetailsSpace.setFont(font);
					ins1DetailsSpace.setFontSize(11);
				    ins1DetailsSpace.setBorder(Border.NO_BORDER);
					
				    ins1Details.addCell(ins1DetailsSpace);
					
					
					Cell ins1DetailCell2=new Cell();
					ins1DetailCell2.add(writerData.getT2name());
					ins1DetailCell2.setFont(font1);
					ins1DetailCell2.setFontSize(10);
					ins1DetailCell2.setBorder(Border.NO_BORDER);
					ins1Details.addCell(ins1DetailCell2);
					
					
					Cell ins1DetailCell5=new Cell();
					ins1DetailCell5.add("Institution");
					ins1DetailCell5.setFont(font);
					ins1DetailCell5.setFontSize(11);
					ins1DetailCell5.setBorder(Border.NO_BORDER);
					ins1Details.addCell(ins1DetailCell5);
					
					ins1Details.addCell(ins1DetailsSpace);
					
					Cell ins1DetailCell6=new Cell();
					ins1DetailCell6.add(writerData.getT2_ins());
					ins1DetailCell6.setFont(font1);
					ins1DetailCell6.setFontSize(10);
					ins1DetailCell6.setBorder(Border.NO_BORDER);
					ins1Details.addCell(ins1DetailCell6);
					
					
					Cell ins1DetailCell3=new Cell();
					ins1DetailCell3.add("Description");
					ins1DetailCell3.setFont(font);
					ins1DetailCell3.setFontSize(11);
					ins1DetailCell3.setBorder(Border.NO_BORDER);
					ins1Details.addCell(ins1DetailCell3);
					
					ins1Details.addCell(ins1DetailsSpace);
					
					Cell ins1DetailCell4=new Cell();
					ins1DetailCell4.add(writerData.getT2desc());
					ins1DetailCell4.setFont(font1);
					ins1DetailCell4.setFontSize(10);
					ins1DetailCell4.setBorder(Border.NO_BORDER);
					ins1Details.addCell(ins1DetailCell4);
				
					doc.add(ins1Details);
					doc.add(space0);
				}
			

				float[] achHeadWidth= {500f};
				Table achHead=new Table(achHeadWidth);
				Cell achHeadCell=new Cell();
				achHeadCell.add("ACHIEVEMENTS");
				achHeadCell.setBackgroundColor(Color.DARK_GRAY);
				achHeadCell.setFont(font);
				achHeadCell.setFontColor(Color.WHITE);
				achHeadCell.setFontSize(12);
				achHeadCell.setBorder(Border.NO_BORDER);
				achHead.addCell(achHeadCell);
				 doc.add(achHead);
				 
				 doc.add(space0);
				 
				 String a1=writerData.getAch2();
				 String a2=writerData.getAch3();
				 String a3=writerData.getAch4();
				 String a4=writerData.getAch5();
				 
				 com.itextpdf.layout.element.List achList=new com.itextpdf.layout.element.List();
				 achList.setFont(font1);
				 achList.setFontSize(11);
				 
				 achList.add(writerData.getAch1());
				 
				 
				 if(!a1.isEmpty()) {
				 achList.add(a1); 
				 }
				 
				 if(!a2.isEmpty()) {
					 achList.add(a2); 
					 }
				 
				 if(!a3.isEmpty()) {
						 achList.add(a3); 
					 }
				 
				 if(!a4.isEmpty()) {
						 achList.add(a4); 
					 }
				 
				 doc.add(achList);

				/*AreaBreak aB=new AreaBreak();
				doc.add(aB);
				
				*/
					float[] hobHeadWidth= {500f};
					Table hobHead=new Table(hobHeadWidth);
					Cell hobHeadCell=new Cell();
					hobHeadCell.add("HOBBIES");
					hobHeadCell.setBackgroundColor(Color.DARK_GRAY);
					hobHeadCell.setFont(font);
					hobHeadCell.setFontColor(Color.WHITE);
					hobHeadCell.setFontSize(12);
					hobHeadCell.setBorder(Border.NO_BORDER);
					hobHead.addCell(hobHeadCell);
					 doc.add(hobHead);
					 
					 doc.add(space0);
					 
					 String h1=writerData.getH2();
					 String h2=writerData.getH3();
					 String h3=writerData.getH4();
					 String h4=writerData.getH5();
					 
					 com.itextpdf.layout.element.List hobList=new com.itextpdf.layout.element.List();
					 hobList.setFont(font1);
					 hobList.setFontSize(11);
					 
					 hobList.add(writerData.getH1());
					 
					 
					 if(!h1.isEmpty()) {
					 hobList.add(h1); 
					 }
					 
					 if(!h2.isEmpty()) {
						 hobList.add(h2); 
						 }
					 
					 if(!h3.isEmpty()) {
							 hobList.add(h3); 
						 }
					 
					 if(!h4.isEmpty()) {
							 hobList.add(h4); 
						 }
					 
					 doc.add(hobList);
						
			
					 
					 doc.add(space0);
					 
						float[] decHeadWidth= {500f};
						Table decHead=new Table(decHeadWidth);
						Cell decHeadCell=new Cell();
						decHeadCell.add("DECLARATION");
						decHeadCell.setBackgroundColor(Color.DARK_GRAY);
						decHeadCell.setFont(font);
						decHeadCell.setFontColor(Color.WHITE);
						decHeadCell.setFontSize(12);
						decHeadCell.setBorder(Border.NO_BORDER);
						decHead.addCell(decHeadCell);
						 doc.add(decHead);
					
			            String dec_str=writerData.getDec(); 
						Paragraph dec=new Paragraph(dec_str);
						dec.setFont(font1);
						dec.setFontSize(10);
						doc.add(dec);
						
						doc.add(space0);
						
						String place_str="Place : "+writerData.getPlace()+"\n"+"("+writerData.getDecname()+")";
						Paragraph place=new Paragraph(place_str);
						place.setFont(font);
						place.setFontSize(10);
						doc.add(place);
						
		                doc.close();
             			i++;
			            System.out.println("Data successfully writed on pdf");
			
		
		
		}
		
		
		
		return i;
	}


public static int generatePin() throws Exception {
	Random generator = new Random();
	generator.setSeed(System.currentTimeMillis());
	  
	int num = generator.nextInt(99999) + 99999;
	if (num < 100000 || num > 999999) {
	num = generator.nextInt(99999);
	if (num < 100000 || num > 999999) {
	throw new Exception("Unable to generate PIN at this time..");
	}
	}
	return num;
	}

}
