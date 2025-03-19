
## 📖 Description

## REST API 메모장 구현  

- 메모를 CRUD할 수 있는 Web Application
1. 메모 생성 기능 C
2. 메모 단 건 조회 기능 R
3. 메모 전체 수정 기능 U
4. 메모 단 건 삭제 기능 D


## HTTP API 설계
- 로그인과 같은 특별한 기능을 제외한 대부분의 API는 CRUD 작업을 수행한다.
- 설계 순서
    1. HTTP Method
        - POST : CREATE
        - GET : READ
        - PUT, PATCH : UPDATE
        - DELETE : DELETE
    2. Restful API → URL Mapping
    3. 요청 및 응답값 설계
    - HTTP Method + URL 만으로 어떤 API인지 구분할 수 있어야 한다.
- 메모 생성
    - POST
    - /memos
- 메모 단건 조회
    - GET
    - /memos/{id}
- 메모 수정(전체)
    - PUT
    - /memos/{id}
- 메모 삭제
    - DELETE
    - /memos/{id}
