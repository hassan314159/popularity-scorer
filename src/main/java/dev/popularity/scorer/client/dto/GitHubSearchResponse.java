package dev.popularity.scorer.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record GitHubSearchResponse(
        @JsonProperty("total_count") int totalCount,
        @JsonProperty("items") List<GitHubRepoItem> items
) {}
