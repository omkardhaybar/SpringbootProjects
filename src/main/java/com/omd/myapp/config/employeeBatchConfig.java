//package com.omd.myapp.config;
//
//import com.omd.myapp.model.Employee;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.item.file.FlatFileItemReader;
//import org.springframework.batch.item.file.LineMapper;
//import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
//import org.springframework.batch.item.file.mapping.DefaultLineMapper;
//import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.io.ClassPathResource;
//
//import javax.sql.DataSource;
//
//public class employeeBatchConfig {
//
//    @Autowired
//    private JobBuilderFactory jobBuilderFactory;
//    @Autowired
//    private StepBuilderFactory stepBuilderFactory;
//    @Autowired
//    private DataSource dataSource;
//
//    @Bean
//    public FlatFileItemReader<Employee> reader(){
//        FlatFileItemReader<Employee> reader=new FlatFileItemReader<>();
//        reader.setResource(new ClassPathResource("employee.csv"));
//        reader.setLineMapper(getLineMapper());
//        reader.setLinesToSkip(1);
//        return reader;
//
//    }
//
//    private LineMapper<Employee> getLineMapper() {
//        DefaultLineMapper<Employee> lineMapper=new DefaultLineMapper<>();
//        DelimitedLineTokenizer lineTokenizer =new DelimitedLineTokenizer();
//        lineTokenizer.setNames(new String[] {"empId","empName","empAddress","empProject"});
//        lineTokenizer.setIncludedFields(new int[] {0,1,2,3});
//        BeanWrapperFieldSetMapper<Employee> fieldSetMapper=new BeanWrapperFieldSetMapper<>();
//        fieldSetMapper.setTargetType(Employee.class);
//
//        lineMapper.setLineTokenizer(lineTokenizer);
//        lineMapper.setFieldSetMapper(fieldSetMapper);
//
//        return lineMapper;
//
//    }
//
//    @Bean
//    public EmployeeProcessor processor(){
//        return new EmployeeProcessor();
//    }
//
//}
