const solution = (age) =>
    age
        .toString()
        .split("")
        .map((v) => ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j"][v])
        .join("");
