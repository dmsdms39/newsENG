# Kotlin 영문뉴스 리더 어플

## 1. newsENG 어플 설명
각기 다른 사이트의 뉴스를 불러와 한번에 읽을 수 있는 뉴스 어플

소스 경로 : newsENG/app/src/main/java/com/example/myapplication/ 

레이아웃 경로 : newsENG/app/src/main/res/layout/

### 1-1. 소스코드 파일 설명
| 파일명 | 파일 용도 |
|:--   |:--      |
| ListNews.kt |  |
| MainActivity.kt | paper DB를 이용해 오프라인 상태에서 뉴스 데이터 캐싱 |
| NewsDetail.kt |  |
| Remote/RetrofitClient.kt | 서버와 클라이언트간 Http 통신을 위한 인터페이스 |
| Model/Article.kt | 가져온 json 파일의 정보를 매칭해서 article data 모델 생성 |
| Model/News.kt | 가져온 json 파일의 정보를 매칭해서 뉴스 list article 모델 |
| Model/Source.kt | 가져온 json 파일의 정보를 매칭해서 뉴스사 상세내용 가져오는 모델  |
| Model/WebSite.kt | 가져온 json 파일의 정보를 매칭해 뉴스사 상태와 소스 담는 모델 |
| Interface/ItemClickListener.kt |  |
| Interface/NewsService.kt |  |
| Common/Common.kt | newsapi.org사이트에서 api key 저장, 이를 사용해 뉴스 전달받음 |
| Common/ISO8601Parser.kt | article data에서 publish 날짜를 사용하기 위해 parse(문서 디코딩)|
| Adapter/ViewHolder/LIstSourceViewHolder.kt | View에 데이터를 넣어주는 역할 |
| Adapter/ViewHolder/ListNewsAdapter.kt | 리사이클러뷰에 표시될 아이템 뷰를 연결, 뉴스 article 데이터를 받아 관리 |
| Adapter/ViewHolder/ListNewsViewHolder.kt | 뉴스사 정보를 view에 연결하고 넣어주는 역할 |
| Adapter/ViewHolder/ListSourceAdapter.kt | 카드뷰에 표시될 아이템 뷰를 연결, 어댑터뷰가 출력할 수 있는 형태로 데이터를 제공 |

### 1-2. 레이아웃 파일 설명
| 파일명 | 파일 용도 | 기능 |
|:--   |:--      |:--    |
| activity_list_news.xml | 뉴스 article list 화면 | diagonallayout 사용으로 사선으로 분할된 이미지 구현, kenburn view로 동적으로 구현  |
| activity_main.xml | 뉴스사 list 화면 | recyclerview를 이용해 각 뉴스사 card 모양의 버튼 구현, relativetimetextview로 몇시간 전 기사인지 확인 |
| activity_news_detail.xml | 뉴스 기사 화면 |  |
| news_layout.xml |  |  |
| source_news_layout.xml | 각 뉴스사 item 화면 | 각 뉴스사를 cardview로 표현, circleimageview로 원형 이미지 구현 |
