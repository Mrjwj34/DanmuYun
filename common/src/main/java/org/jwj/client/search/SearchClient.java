package org.jwj.client.search;

import org.jwj.client.pojo.RecommendVideo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Component
@FeignClient(name = "search")
public interface SearchClient {
    @GetMapping("/search/likelyVideoRecommend/{videoId}")
    List<RecommendVideo> getRecommendVideo(@PathVariable String videoId);
}
