package com.innominds.functional;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionInterfaceUsage {

    public static void main(String[] args) {

        // CONSUMERS DOESN'T HAVE RETURN TYPE
        final Consumer<Training> consumer = TrainingUtil::addTraining;
        consumer.accept(new Training("JAVA", new Date()));

        final BiConsumer<String, Date> biconsumer = TrainingUtil::addTraining;
        biconsumer.accept("JPA", new Date());

        // FUNCTIONS HAVE ARGUMENTS AND RETURN TYPES
        final Function<String, Date> fun = TrainingUtil::getTrainingDate;

        System.out.println(fun.apply("JAVA"));

        final BiFunction<String, Date, List<?>> trainings = TrainingUtil::getTrainings;

        System.out.println(trainings.apply("JPA", new Date()));

        // PREDICATES HAVE BOOLEAN RETURN TYPE

        final Predicate<String> isTrainingAdded = TrainingUtil::isJavaTraining;

        System.out.println(isTrainingAdded.test("JAVA"));

        final BiPredicate<String, Date> isAvailable = TrainingUtil::isTrainingAdded;

        System.out.println(isAvailable.test("Java", new Date()));

        // Custom functional interface
        final CustomFunctional<String, String, Date, Boolean> c = TrainingUtil::customFun;

        System.out.println(c.run("", "", new Date()));

        // FILTERING
        List<String> training = Arrays.asList("JAVA", "C", "PYTHON", "JPA", "SPRING", "Adv JAVA");

        System.out.println(training);

        training = training.stream().filter(TrainingUtil::isJavaTraining).collect(Collectors.toList());

        System.out.println(training);

    }
}
