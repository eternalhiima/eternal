package com.eternal.web.controller;

import java.math.BigDecimal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.eternal.web.aop.ApiLog;
import com.eternal.web.config.WebApiEndPoint;
import com.eternal.web.dto.request.TalkThemeListRequest;
import com.eternal.web.dto.response.TalkThemeListResponse;
import com.eternal.web.service.TalkThemeService;
import com.eternal.web.type.ApiComponentType;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(WebApiEndPoint.ROOT_END_POINT)
public class TalkThemeController {

    /** トークテーマサービス */
    private final TalkThemeService talkThemeService;

    /**
     * Ref001_トークテーマ一覧取得
     *
     * @param count 取得数
     * @param maxCount 最大取得数
     * @param categoryId カテゴリID
     * @param sortKey ソートキー
     * @param sort ソート順
     * @return TalkThemeListResponse
     */
    @ApiLog(apiComponentType = ApiComponentType.REF001)
    @RequestMapping(value = WebApiEndPoint.TALKLIST_END_POINT, method = RequestMethod.GET)
    public TalkThemeListResponse getTalkThemeList(
            @RequestParam BigDecimal count,
            @RequestParam BigDecimal maxCount,
            @RequestParam BigDecimal categoryId,
            @RequestParam String sortKey,
            @RequestParam String sort) {
        return talkThemeService.getTalkThemeResponse(TalkThemeListRequest.of(count, maxCount, categoryId, sortKey, sort));
    }
}