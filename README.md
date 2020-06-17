# Java-Rhythm-Game-Project
##### 자바 Swing package + GUI Programming을 활용한 리듬게임

# 메인 화면
<img width="700" alt="2020-06-17 (1)" src="https://user-images.githubusercontent.com/50096346/84855923-4c533980-b0a0-11ea-83b3-f0a69db0dc02.png">

###### 프로젝트 실행과 동시에 해당 화면이 출력되고, 백그라운드 음악이 재생되며 시작하기/종료하기 버튼 기능 활성화 등의 기능을 담고 있음
###### awt, swing package import를 통하여 버튼기능 활성화, 이미지 아이콘 삽입, 배경음악 삽입 등이 이루어짐, 난이도 조정 기능

# 서브 화면
<img width="315" alt="2020-06-17 (3)" src="https://user-images.githubusercontent.com/50096346/84855927-4e1cfd00-b0a0-11ea-9dab-52ed676ffc14.png"><img width="315" alt="2020-06-17 (4)" src="https://user-images.githubusercontent.com/50096346/84855930-4f4e2a00-b0a0-11ea-8b86-20dabfaa7e5d.png"><img width="315" alt="2020-06-17 (5)" src="https://user-images.githubusercontent.com/50096346/84855933-4fe6c080-b0a0-11ea-886a-a4f76d314bd4.png">

###### 메인 화면과 마찬가지로 awt, swing 패키지의 method를 활용하여 버튼, 이미지, 배경음악등을 이룸. 
###### 마우스 이벤트와 같은 이벤트 처리기능 또한 담고 있음

# 게임실행 초기화면 및 실행화면
<img width="700" alt="2020-06-17 (6)" src="https://user-images.githubusercontent.com/50096346/84855937-5117ed80-b0a0-11ea-8c90-ac65d987b976.png">
<img width="700" alt="2020-06-17 (7)" src="https://user-images.githubusercontent.com/50096346/84855938-52491a80-b0a0-11ea-8a7d-ce540105c2df.png">
<img width="700" alt="2020-06-17 (8)" src="https://user-images.githubusercontent.com/50096346/84855940-52e1b100-b0a0-11ea-86f7-4e845ce4b810.png">

###### 서브 화면에서 난이도를 선택하면, 게임 실행 초기화면이 뜨게 됨. 
###### 게임 실행 초기화면의 경우 게임 사용자가 키보드 감을 익히게 하게 위하여 sleep 함수를 적용하여 10초정도의 여유시간을 둠 
###### 10초 후, 음악 재생과 동시에 비트가 떨어지며 사용자는 키보드를 누르며 게임을 실행할 수 있음 
###### (비트의 간격 조정을 통해 Perfect, Great, Early, Miss, Late라는 문구가 뜨는 것을 확인할 수 있고(비트의 위치 고려), 
###### 해당 키보드를 누르게 되면 해당 키패드가 반짝거리는 것을 확인할 수 있음(awt 패키지의 키보드 이벤트 적용)) 
###### 난이도는 easy mode, hard mode가 있으며 easy 모드의 경우 hard 모드에 비해 비트가 떨어지는 속도가 느리고, 더 적게 떨어짐 
