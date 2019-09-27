package io.gitplag.gitplagapi.model.input

data class FileSearchCriteria(
    val branch: String? = null,
    val fileName: String? = null,
    val student: String? = null
)