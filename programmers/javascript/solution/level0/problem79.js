function solution(numbers) {
    numbers.sort((a, b) => a - b);
    var [A, B] = [numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]];
    var answer = A >= B ? A : B;

    return answer;
}
