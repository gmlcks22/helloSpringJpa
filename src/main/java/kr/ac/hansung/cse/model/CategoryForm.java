package kr.ac.hansung.cse.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryForm {
    @NotBlank(message = "카테고리 이름을 입력하세요.")
    @Size(max = 50, message = "카테고리는 50자 이하여야 합니다.")
    private String name;
}