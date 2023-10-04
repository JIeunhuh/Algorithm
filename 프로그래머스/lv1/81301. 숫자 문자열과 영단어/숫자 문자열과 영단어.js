function solution(s){
    // 반복문과 replace를 활용해서 solution 풀기 
    // let answer = 0; 이것도 써보고 
    // numbers list 만들기
    let numbers = ['zero','one','two','three','four','five','six','seven','eight','nine'];
    // forEach 반복문 -> (i='영어문구'에 해당, idx = list의 index에 해당해서 해당 문구에 맞춘 idx를 반환해서 숫자로 변환)
    numbers.forEach((i,idx) => s=s.replaceAll(i, idx));
    // typeof = 타입 확인
    console.log(typeof s);
    //String type이라 숫자형으로 변환 해줌
    s = parseInt(s);
    console.log('type check : ',typeof s);
    return s;
}