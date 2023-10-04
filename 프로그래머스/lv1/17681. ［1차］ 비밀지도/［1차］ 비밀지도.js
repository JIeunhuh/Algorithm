function solution(n, arr1, arr2) {
    // n = 배열 갯수
    // arr1, arr2 = n개의 배열(십진수)
    // 벽 = 두 개의 배열 중 하나라도 1이 있으면
    // 공백 = 두 개의 배열 즁 둘다 0 있으면
    let answer = [];

    // arr1, 2를 이진수로 변환하고 padStrat를 이용해 이진수의 자릿수를 맞춰줌
    const binaryArr1 = arr1.map((item) => {
        return item.toString(2).padStart(n, '0');
    });

    const binaryArr2 = arr2.map((item) => {
        return item.toString(2).padStart(n, '0');
    });

    console.log('arr1',binaryArr1);
    
    // 2진수로 만들어진 배열 순회 
    for (let i = 0; i < n; i++) {
        let res = '';
        for (let j = 0; j < n; j++) {
            // 1이 하나라도 있으면 벽
            if (binaryArr1[i][j] == 1 || binaryArr2[i][j] == 1) {
                res += '#';
            }
            // 둘다 0이여야 공백
            else if (binaryArr1[i][j] == 0 && binaryArr2[i][j] == 0) {
                res += ' ';
            }
        }
        // list에 추가
        answer.push(res);
    }

    console.log('answer', answer);

    return answer;
}