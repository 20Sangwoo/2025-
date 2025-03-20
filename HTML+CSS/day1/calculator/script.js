/* script.js */

// 변수를 빈 문자열로 초기화, 이 변수는 사용자가 입력한 계산식을 저장하는 역할을 함
let expression = '';

// 사용자가 클릭한 버튼의 값을 expression에 추가하는 함수
function inputValue(value) {                                // value는 매개변수로 사용자가 클릭한 값이나 연산자
    expression += value;                                    // expression 변수에 클릭한 값을 이어붙임
    document.getElementById('display').value = expression;  // 사용자에게 입력한 값을 표시함 ex) 1 + 2 로 표시되도록
}

// 계산기 화면을 초기화하는 함수
function clearDisplay() {
    expression = '';                                        // expression 변수를 빈 문자열로 재설정함
    document.getElementById('display').value = '';          // 계산기 화면(display)도 빈 상태로 만들어 사용자에게 입력을 새로 시작할 수 있게 함
}

// 현재 입력된 수식을 계산하고 결과를 화면에 표시하는 함수
function calculateResult() {
    try {                                                   // try 블록 내에서 eval() 함수를 사용하여 변수에 담은 수식을 계산 후 문자열로 변환해 저장
        expression = eval(expression).toString();           // eval() : 문자열로 된 수식을 계산할 때에 사용되는 함수 / toString() : 값을 문자열로 변환하는 함수
        document.getElementById('display').value = expression;  // 계산 결과를 계산기 화면에 표시함
    } catch (e) {                                           // 만약 오류가 발생할 시 catch 블록내에서 오류 메시지 출력 기능을 처리하고 입력받은 값 초기화
        document.getElementById('display').value = '오류';
        expression = '';
    }
}