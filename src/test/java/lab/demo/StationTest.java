package lab.demo;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StationTest {

    @Test
    @DisplayName("DevOps를 위한 Station 도메인 생성 테스트")
    void createStation_success() {
        // when, then
        assertDoesNotThrow(() -> new Station("잠실역"));
    }

    @Test
    @DisplayName("DevOps를 위한 Station 도메인 실패 테스트")
    void createStation_fail() {
        // when, then
        assertThatThrownBy(() -> new Station("역"))
            .isInstanceOf(IllegalArgumentException.class);
    }
}