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
| Model/Article.kt | 가져온 json 파일의 정보를 매칭해서 article data 모델 생성 |
| Model/News.kt | 가져온 json 파일의 정보를 매칭해서 뉴스 article 모델 생성  |
| Model/Source.kt |  |
| Model/WebSite.kt |  |
| Interface/ItemClickListener.kt |  |
| Interface/NewsService.kt |  |
| Common/Common.kt | newsapi.org사이트에서 api key를 사용해 뉴스 전달받음 |
| Common/ISO8601Parser.kt | article data에서 publish날짜를 사용하기 위해 변형|
| Adapter/ViewHolder/LIstSourceViewHolder.kt |  |
| Adapter/ViewHolder/ListNewsAdapter.kt | 리사이클러뷰에 표시될 아이템 뷰를 연결, 뉴스 article 정보를 담는 어댑터 |
| Adapter/ViewHolder/ListNewsViewHolder.kt | 뉴스 article 정보를 view에 연결시켜줌 |
| Adapter/ViewHolder/ListSourceAdapter.kt | 카드뷰에 표시될 아이템 뷰를 연결 |

### 1-2. 레이아웃 설명
| 파일명 | 파일 용도 | 기능 |
|:--   |:--      |:--    |
| activity_list_news.xml | 각 뉴스사 article list 화면 | diagonallayout 사용으로 사선으로 분할된 이미지 구현, kenburn view로 동적으로 구현  |
| activity_main.xml | 뉴스사 list | cardview를 이용해 각 뉴스사 card 모양의 버튼 구현, relativetimetextview로 현재로 부터 몇시간 전의 기사인지 확인 가능 |
| activity_news_detail.xml |  |  |
| news_layout.xml |  |  |
| source_news_layout.xml |  |  |
