package io.github.eendroroy.sdk.sslcommerz.response.nested

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author indrajit
 */
data class DesignResponse(
    @JsonProperty("main_bk_img") var mainBkImg: String? = null,
    @JsonProperty("main_bk_color") var mainBkColor: String? = null,
    @JsonProperty("main_font_color") var mainFontColor: String? = null,
    @JsonProperty("title_bk_color") var titleBkColor: String? = null,
    @JsonProperty("title_font_color") var titleFontColor: String? = null,
    @JsonProperty("btn_yes_bk_color") var btnYesBkColor: String? = null,
    @JsonProperty("btn_yes_font_color") var btnYesFontColor: String? = null,
    @JsonProperty("btn_no_bk_color") var btnNoBkColor: String? = null,
    @JsonProperty("btn_no_font_color") var btnNoFontColor: String? = null
)
