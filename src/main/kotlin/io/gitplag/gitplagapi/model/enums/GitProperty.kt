package io.gitplag.gitplagapi.model.enums

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.gitplag.gitplagapi.model.util.GitPropertyDeserializer

/**
 * Name of a git service.
 */
@JsonDeserialize(using = GitPropertyDeserializer::class)
enum class GitProperty {
    GITHUB,
    BITBUCKET,
    GITLAB;

    override fun toString(): String = name.toLowerCase()
}