package de.dhbw.softwareengineering.ausgabenmanager.application.unitTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;
import de.dhbw.softwareengineering.ausgabenmanager.application.services1.SpendingSumLimiterService;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.SpendingSumLimiterEntity;
import de.dhbw.softwareengineering.ausgabenmanager.domain.repositories.SpendingSumLimiterRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.annotation.Testable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@Testable
@ExtendWith(MockitoExtension.class)
public class SpendingSumLimiterRepositoryTest {

    @Mock
    private SpendingSumLimiterRepository limiterRepository;

    @InjectMocks
    private SpendingSumLimiterService limiterService;

    @Test
    public void isValidTeamchef() {
            assertDoesNotThrow(() -> {
                Optional<SpendingSumLimiterEntity> mockLimiter = Optional.of(new SpendingSumLimiterEntity(2L, 10));
                when(limiterRepository.getById(1l)).thenReturn(mockLimiter);
                SpendingSumLimiterEntity limit = limiterService.getById(1l);

                assertEquals(mockLimiter.get().getId(), limit.getId());
                assertEquals(mockLimiter.get().getMaxSpendingSum(), limit.getMaxSpendingSum());

                assertDoesNotThrow(() -> {
                    new SpendingSumLimiterEntity(mockLimiter.get().getId(), mockLimiter.get().getMaxSpendingSum());
                });
            });

        }


}
