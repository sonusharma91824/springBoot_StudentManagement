package com.demo.jasper.report.service;
//
//import com.demo.jasper.report.repository.ReportRepository;
//import jakarta.servlet.http.HttpServletResponse;
//import net.sf.jasperreports.engine.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.ResourceUtils;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//@Service
//public class ReportService {
//
//    @Autowired
//    private ReportRepository repository;

//    public void exportJasperReport(HttpServletResponse response) throws JRException, IOException {
//        List<Port> port = repository.findAll();
//        //Get file and compile it
//        File file = ResourceUtils.getFile("classpath:page3.jrxml");
//        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
//        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(port);
//        Map<String, Object> parameters = new HashMap<>();
//        parameters.put("a", "b");
//        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
//        JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
//    }
//
//
//        public void exportJasperReport(HttpServletResponse response) throws JRException, IOException {
//            // Get file and compile it
//            File file = ResourceUtils.getFile("classpath:page2.jrxml");
//            JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
//
//            // Set parameters if needed
//            Map<String, Object> parameters = new HashMap<>();
//            parameters.put("a", "b");
//
//            // Fill the report (without data source)
//            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
//
//            // Export to PDF
//            JasperExportManager.exportReportToPdfStream(jasperPrint, response.getOutputStream());
//        }
//
//    public void exportJasperReport(HttpServletResponse response) throws JRException, IOException {
//            // Compile each JRXML file
//            JasperPrint jasperPrintPage2 = compileAndFillReport("classpath:page2.jrxml");
//            JasperPrint jasperPrintPage3 = compileAndFillReport("classpath:page3.jrxml");
//
//            // Merge JasperPrint objects
//            JasperPrint mergedJasperPrint = mergeJasperPrints(jasperPrintPage2, jasperPrintPage3);
//
//            // Export merged JasperPrint to PDF
//            JasperExportManager.exportReportToPdfStream(mergedJasperPrint, response.getOutputStream());
//        }
//
//        private JasperPrint compileAndFillReport(String jrxmlPath) throws JRException, IOException {
//            // Compile JRXML file
//            File file = ResourceUtils.getFile(jrxmlPath);
//            JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
//
//            // Set parameters if needed
//            Map<String, Object> parameters = new HashMap<>();
//            parameters.put("a", "b");
//
//            // Fill the report (without data source)
//            return JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
//        }
//
//        private JasperPrint mergeJasperPrints(JasperPrint... jasperPrints) {
//            JasperPrint mergedJasperPrint = new JasperPrint();
//            for (JasperPrint jasperPrint : jasperPrints) {
//                for (JRPrintPage page : jasperPrint.getPages()) {
//                    mergedJasperPrint.addPage(page);
//                }
//            }
//            return mergedJasperPrint;
//        }


//      public void exportJasperReport(HttpServletResponse response) throws JRException, IOException {
//            // Compile each JRXML file
//          JasperPrint jasperPrintPage1 = compileAndFillReport("classpath:page1.jrxml");
//          JasperPrint jasperPrintPage2 = compileAndFillReport("classpath:page2.jrxml");
//            JasperPrint jasperPrintPage3 = compileAndFillReport("classpath:page3.jrxml");
//            JasperPrint jasperPrintPage4 = compileAndFillReport("classpath:page4.jrxml");
//            JasperPrint jasperPrintPage5 = compileAndFillReport("classpath:page5.jrxml");
//            JasperPrint jasperPrintPage6 = compileAndFillReport("classpath:page6.jrxml");
//
//
//
//            JasperPrint mergedJasperPrint = mergeJasperPrints(jasperPrintPage1,jasperPrintPage2, jasperPrintPage3,jasperPrintPage4,jasperPrintPage5,jasperPrintPage6);
//            JasperExportManager.exportReportToPdfStream(mergedJasperPrint, response.getOutputStream());
//        }
//
//        private JasperPrint compileAndFillReport(String jrxmlPath) throws JRException, IOException {
//            File file = ResourceUtils.getFile(jrxmlPath);
//            JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
//
//            Map<String, Object> parameters = new HashMap<>();
//            parameters.put("a", "b");
//
//            return JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
//        }
//        private JasperPrint mergeJasperPrints(JasperPrint... jasperPrints) {
//            JasperPrint mergedJasperPrint = new JasperPrint();
//
//            if (jasperPrints.length > 0) {
//                mergedJasperPrint.setPageWidth(jasperPrints[0].getPageWidth());
//                mergedJasperPrint.setPageHeight(jasperPrints[0].getPageHeight());
//                mergedJasperPrint.setOrientation(jasperPrints[0].getOrientationValue());
//            }
//            for (JasperPrint jasperPrint : jasperPrints) {
//                for (JRPrintPage page : jasperPrint.getPages()) {
//                     mergedJasperPrint.addPage(page);
//                }
//            }
//            return mergedJasperPrint;
//        }
//
//
//}






