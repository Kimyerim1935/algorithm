function solution(money) {
    let coffeePrice = 5500;
    let coffeeCount = parseInt(money / coffeePrice);
    let saveMoney = money - coffeePrice * coffeeCount;

    var answer = [];

    answer.push(coffeeCount, saveMoney);

    return answer;
}
