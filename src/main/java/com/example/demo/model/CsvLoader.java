package com.example.demo.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.CsvRepository;



public class CsvLoader {
	
	@Autowired
	CsvRepository csvRepo;
	
	public void run() {
      List<CsvData> csvdata = readBooksFromCSV("C:/Users/consultadd/Downloads/data1.csv");
     
      csvRepo.saveAll(csvdata);
  }

  private static List<CsvData> readBooksFromCSV(String fileName) {
      List<CsvData> csvdata = new ArrayList<CsvData>();
      Path pathToFile = Paths.get(fileName);

      try (BufferedReader br = Files.newBufferedReader(pathToFile)) {

      	br.readLine();
          
          String line = br.readLine();

          while (line != null) {

             
              String[] attributes = line.split(",");
      
              CsvData data = createBook(attributes);

              csvdata.add(data);             

              line = br.readLine();
          }

      } catch (IOException ioe) {
          ioe.printStackTrace();
      }
     

      	

      return csvdata;
  }

  private static CsvData createBook(String[] metadata) {
  	
  	String signup = metadata[0];
      String first = metadata[1];
      String last = metadata[2];
      String email = metadata[3];
      String latitude = metadata[4];
      String longitude = metadata[5];
      String ip = metadata[6];
      
      // create and return book of this metadata
      return new CsvData(signup, first, last, email, latitude, longitude, ip);
  }
  


}
