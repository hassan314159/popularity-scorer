package dev.popularity.scorer.service;

import dev.popularity.scorer.controller.dto.RepositoryScoringRequest;
import dev.popularity.scorer.controller.dto.RepositoryScoringResponse;
import reactor.core.publisher.Mono;

public interface RepositoryScoringService {
    Mono<RepositoryScoringResponse> scoreRepositories(RepositoryScoringRequest request);
}
