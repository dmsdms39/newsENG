# Kotlin 영문뉴스 리더 어플

## 1. newsENG 어플 설명
각기 다른 사이트의 뉴스를 불러와 한번에 읽을 수 있는 뉴스 어플
포스팅 주소 : https://eu-ne.tistory.com/entry/Android-Studio-%EC%BD%94%ED%8B%80%EB%A6%B0%EC%9C%BC%EB%A1%9C-%EB%89%B4%EC%8A%A4-%EB%A6%AC%EB%8D%94-%EC%96%B4%ED%94%8C-%EB%A7%8C%EB%93%A4%EA%B8%B0
소스 경로 : newsENG/app/src/main/java/com/example/myapplication/
레이아웃 경로 : newsENG/app/src/main/res/layout/

### 1-1. 파일 설명
| 파일명 | 파일 용도 |
|:--   |:--      |
| ListNews.kt |  |
| MainActivity.kt |  |
| NewsDetail.kt |  |
| Remote/RetrofitClient.kt |  |
| Model/Article.kt |  |
| Model/News.kt |  |
| Model/Source.kt |  |
| Model/WebSite.kt |  |
| Interface/ItemClickListener.kt |  |
| Interface/NewsService.kt |  |
| Common/Common.kt | newsapi.org사이트에서 api key를 가져옴. |
| Common/ISO8601Parser.kt |  |
| Adapter/ViewHolder/LIstSourceViewHolder.kt |  |
| Adapter/ViewHolder/ListNewsAdapter.kt |  |
| Adapter/ViewHolder/ListNewsViewHolder.kt |  |
| Adapter/ViewHolder/ListSourceAdapter.kt |  |

### 1-2. 레이아웃 설명
| 파일명 | 파일 용도 | 기능 |
|:--   |:--      |:--    |
| activity_list_news.xml |  |  |
| activity_main.xml |  |  |
| activity_news_detail.xml |  |  |
| news_layout.xml |  |  |
| source_news_layout.xml |  |  |
