package io.gitplag.gitplagapi.model.output.file.info

import java.time.LocalDateTime

data class BaseBranchInfo(
    val branch: String,
    val updated: LocalDateTime,
    val files: List<FileInfo>
)