package com.dat.backend.crawl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/crawl")
public class CrawlController {
    private final CrawlService crawlService;

    @PostMapping("/start")
    public ResponseEntity<List<ProductResponse>> startCrawl(@RequestBody CrawlRequest crawlRequest) {
        return ResponseEntity.ok(crawlService.crawlProducts(crawlRequest));
    }
}
