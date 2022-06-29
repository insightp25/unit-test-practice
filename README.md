## Unit Test 연습

### 과제
`TranscriptServiceImplTest.class`를 완성하여 모든 테스트가 성공적으로 수행되도록 만들어 주세요.
#### 진행 순서
1. 이 Repository를 clone한 후, 로컬에서 새로운 branch를 만들어주세요. branch 이름은 자유롭게 해주세요.
2. 새로 만든 branch에서 작업을 완료한 후, 제가 리뷰할 수 있게 PR을 올려주세요.

### 테스트 실행 방법 (두 방법 중 한 가지 방법을 이용)
1. Terminal에서 `./gradlew test`를 실행한다.
2. Intellij에서 `TranscriptServiceImplTest.class`를 실행한다. (단축키: `ctrl`+`option`+`R`)

### 제한 사항
- 테스트 클래스 외 다른 코드를 수정하지 말아주세요. 다만, 테스트 외 코드에서 버그를 발견하면 수정해주세요.

### 부가 정보
- 테스트를 실행하고나면 `build/reports/jacoco/index.html`이 생성되고, 이 파일을 웹브라우저로 열면 Test Coverage를 볼 수 있습니다.
모든 테스트를 작성한 후, Test Coverage 100%를 달성했는지 확인해주세요.

### 검색 키워드
- Mockito
- Junit5
- Unit Test