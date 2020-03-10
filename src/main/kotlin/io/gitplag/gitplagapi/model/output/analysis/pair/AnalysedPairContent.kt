package io.gitplag.gitplagapi.model.output.analysis.pair

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import io.gitplag.gitplagapi.model.output.file.content.FileContent

@JsonIgnoreProperties(ignoreUnknown = true)
data class AnalysedPairContent(
    @JsonProperty(value = "files1", required = true)
    val files1: Collection<FileContent>,
    @JsonProperty(value = "files2", required = true)
    val files2: Collection<FileContent>,
    @JsonProperty(value = "pair", required = true)
    val pair: AnalysedPair
)