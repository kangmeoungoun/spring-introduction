타입리프 장점이 html 을 그대로 서버 없이 파일을 열어도 확인가능하다.
템플릿 엔진으로 동작시  hello! empty 값이  'hello '+ ${name} 치환 된다.

<p th:text="'hello '+ ${name}">hello! empty</p>