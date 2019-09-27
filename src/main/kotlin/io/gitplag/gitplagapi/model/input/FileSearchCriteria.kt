package io.gitplag.gitplagapi.model.input

data class FileSearchCriteria(
    val branch: String?,
    val fileName: String?,
    val student: String?
)