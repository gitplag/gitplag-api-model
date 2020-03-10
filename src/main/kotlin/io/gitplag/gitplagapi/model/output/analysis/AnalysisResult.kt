package io.gitplag.gitplagapi.model.output.analysis

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import io.gitplag.gitplagapi.model.enums.AnalyzerProperty
import java.time.LocalDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
data class AnalysisResult(
    @JsonProperty(value = "id", required = true)
    val id: Long,
    @JsonProperty(value = "repo", required = true)
    val repo: Long,
    @JsonProperty(value = "repoName", required = true)
    val repoName: String,
    @JsonProperty(value = "analyzer", required = true)
    val analyzer: AnalyzerProperty,
    @JsonProperty(value = "branch", required = true)
    val branch: String,
    @JsonProperty(value = "date", required = true)
    @JsonSerialize(using = LocalDateTimeSerializer::class)
    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    val date: LocalDateTime,
    @JsonProperty(value = "resultLink", required = true)
    val resultLink: String,
    @JsonProperty(value = "analysisPairs", required = true)
    val analysisPairs: List<AnalyzedPairInfo>,
    @JsonProperty(value = "studentsWithoutSolutions", required = true)
    val studentsWithoutSolutions: String
)