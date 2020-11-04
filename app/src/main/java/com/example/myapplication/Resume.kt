package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_resume.*
import com.github.barteksc.pdfviewer.PDFView as GithubBartekscPdfviewerPDFView
import com.github.barteksc.pdfviewer.PDFView as PdfviewerPDFView

class Resume : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resume)

        // PDFview pdfView;
        pdfView.fromAsset("anthony_rom_resume.docx.pdf")
    }
}