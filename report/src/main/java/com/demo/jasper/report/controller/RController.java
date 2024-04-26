package com.demo.jasper.report.controller;
import com.demo.jasper.report.dto.JasperReportDto;
import com.demo.jasper.report.entity.Port;
import com.demo.jasper.report.repository.ReportRepository;
import com.demo.jasper.report.service.PageFirstService;
//import com.demo.jasper.report.service.ReportService;
import jakarta.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
//@RestController
//@Controller
//@RequestMapping("/port")
//public class RController {
//    @Autowired
//    private ReportRepository repository;
////    @Autowired
////    private ReportService service;
//     @Autowired
//   private JasperReportDto jasperReportDto;
//
//    @Autowired
//    private PageFirstService pageFirstService;
//
//
//    @GetMapping("/getAddress")
//    public List<Port> getAddress() {
//        List<Port> port = (List<Port>) repository.findAll();
//        return port;
//    }
////    @GetMapping("/jasperpdf/export")
////    public void createPDF(HttpServletResponse response) throws IOException, JRException {
////        response.setContentType("application/pdf");
////        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
////        String currentDateTime = dateFormatter.format(new Date());
////
////        String headerKey = "Content-Disposition";
////        String headerValue = "attachment; filename=pdf_" + currentDateTime + ".pdf";
////        response.setHeader(headerKey, headerValue);
////        service.exportJasperReport(response);
////    }
//
//
//    @PostMapping(value = "/generate-report", produces = MediaType.APPLICATION_PDF_VALUE)
//    public ResponseEntity<byte[]> generateReport(@RequestBody JasperReportDto jasperReportDto ) {
//        try {
//            byte[] pdfBytes = pageFirstService.generateReport(jasperReportDto);
//
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_PDF);
//            headers.setContentDispositionFormData("filename", "report.pdf");
//
//            return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//}

