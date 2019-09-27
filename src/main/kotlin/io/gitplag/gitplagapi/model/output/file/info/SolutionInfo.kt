package io.gitplag.gitplagapi.model.output.file.info

import java.time.LocalDateTime

data class SolutionInfo(
    val student: String,
    val updated: LocalDateTime,
    val files: Collection<FileInfo>
)