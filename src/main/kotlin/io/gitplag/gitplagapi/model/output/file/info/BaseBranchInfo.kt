package io.gitplag.gitplagapi.model.output.file.info

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

data class BaseBranchInfo(
    @JsonProperty(value = "branch", required = true)
    val branch: String,
    @JsonProperty(value = "updated", required = true)
    val updated: LocalDateTime,
    @JsonProperty(value = "files", required = true)
    val files: Collection<FileInfo>
)