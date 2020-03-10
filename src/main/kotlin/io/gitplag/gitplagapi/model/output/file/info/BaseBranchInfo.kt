package io.gitplag.gitplagapi.model.output.file.info

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
data class BaseBranchInfo(
    @JsonProperty(value = "branch", required = true)
    val branch: String,
    @JsonProperty(value = "updated", required = true)
    val updated: LocalDateTime,
    @JsonProperty(value = "files", required = true)
    val files: Collection<FileInfo>
)