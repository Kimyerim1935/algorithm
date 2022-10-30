function solution(my_string) {
    const numbers = "0123456789";
    return my_string
        .split("")
        .filter((letter) => numbers.includes(letter))
        .map((letter) => Number(letter))
        .sort((num1, num2) => num1 - num2);
}
