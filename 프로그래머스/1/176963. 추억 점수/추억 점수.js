function solution(name, yearning, photo) {
    let answer = [];
    let nameScore = {};

    // {name-yearning} key-value 쌍으로 만들어줌
    for (let i = 0; i < name.length; i++) {
        nameScore[name[i]] = yearning[i];
        console.log(nameScore);
    }
    console.log('key', Object.values(nameScore));

    for (let i = 0; i < photo.length; i++) {
        // 더할 값 지정해줌(배열 돌면서 더하기)
        let sum = 0;
        for (let j = 0; j < photo[i].length; j++) {
            let person = photo[i][j];
            // nameScore이 undefined가 아니면(배열에 존재하면), nameScore의 값을 계속 더해줌
            if (nameScore[person] !== undefined) {
                sum = sum + nameScore[person];
            }
        }
        answer.push(sum);
    }

        console.log('answer', answer);

        return answer;
}