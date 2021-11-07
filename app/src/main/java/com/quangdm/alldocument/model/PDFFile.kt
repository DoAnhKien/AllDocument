package com.quangdm.alldocument.model

data class PDFFile(
    var pdfId: Int,
    var pdfDirection: String,
    var pdfDate: String,
    var isLove: Boolean
) {
}