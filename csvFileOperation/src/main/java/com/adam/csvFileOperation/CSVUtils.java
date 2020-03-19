package com.adam.csvFileOperation;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.adam.modler.NewModel;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class CSVUtils {
	public List<NewModel> readCsv(String readPath) {
		String filePath = readPath;
//		List<String> list = new ArrayList<>();
		List<NewModel> dataList = new ArrayList<>();
		try {
			CsvReader csvReader = new CsvReader(filePath);
//			 csvReader按行读取
			 csvReader.readHeaders();
			while (csvReader.readRecord()) {
				String str = csvReader.getRawRecord();
				String[] strList =  str.split(","); //TODO 如果字段值中存在“,”的处理
				NewModel newModel = generateNewModel(strList);
				dataList.add(newModel);
//				list.add(str);
			}
			csvReader.close();
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
		return dataList;

	}

	private NewModel generateNewModel(String[] strList) {
		// TODO Auto-generated method stub
		NewModel newModel = new NewModel();
		newModel.setColumn_A(strList[1]);
		newModel.setColumn_B(strList[3]);
		return newModel;
	}

	public void writeCSV(List<String> listData) {
		String csvFilePath = "C:\\Users\\badpc\\Desktop\\t_1.csv";
		try {
		CsvWriter csvWrite = new CsvWriter(csvFilePath, ',', Charset.forName("UTF-8"));
		//header
		String[] str = new String[1];
		str[0] = listData.get(0);
		csvWrite.writeRecord(str);
		//content
		for (int i = 1; i < listData.size(); i++) {
			String[] str1 = new String[]{listData.get(i)};
			csvWrite.writeRecord(str1);
		}
		csvWrite.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
