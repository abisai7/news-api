INSERT INTO categories (id, name)
VALUES (1, 'Ciencia'),
       (2, 'Tecnología'),
       (3, 'Energía'),
       (4, 'Paleontología'),
       (5, 'Salud'),
       (6, 'Medio Ambiente'),
       (7, 'Deportes'),
       (8, 'Economía'),
       (9, 'Internacional'),
       (10, 'Seguridad');

INSERT INTO news (id, title, image, description, content)
VALUES (1, 'Descubrimiento en Marte', 'mars_discovery.jpg', 'La NASA encuentra evidencia de agua en Marte.',
        'Científicos de la NASA han descubierto rastros de agua en la superficie marciana, lo que aumenta la posibilidad de vida en el planeta rojo.'),
       (2, 'Avance en IA', 'ai_progress.jpg', 'Nueva inteligencia artificial supera a los humanos en lógica.',
        'Investigadores han desarrollado un modelo de inteligencia artificial que supera a los humanos en tareas de razonamiento lógico y resolución de problemas complejos.'),
       (3, 'Revolución en Energía Solar', 'solar_energy.jpg', 'Nuevo panel solar promete eficiencia del 50%.',
        'Una startup ha creado un nuevo material que permite a los paneles solares alcanzar una eficiencia récord, reduciendo costos y mejorando la sostenibilidad.'),
       (4, 'Descubrimiento de Dinosaurio', 'dinosaur_discovery.jpg', 'Hallan fósil de dinosaurio nunca antes visto.',
        'Paleontólogos descubrieron en Argentina el fósil de una nueva especie de dinosaurio que podría cambiar la historia de la evolución.'),
       (5, 'Avance en Medicina', 'medical_breakthrough.jpg', 'Cura experimental para el cáncer muestra éxito.',
        'Un tratamiento experimental contra el cáncer ha mostrado resultados prometedores en pacientes en fase terminal, abriendo nuevas posibilidades para la medicina.'),
       (6, 'Explosión en Planta Nuclear', 'nuclear_accident.jpg',
        'Accidente en planta nuclear de Europa genera alarma.',
        'Una explosión en una central nuclear ha provocado la evacuación de miles de personas y un llamado a revisión de las políticas energéticas.'),
       (7, 'Nuevo Récord en Deporte', 'sports_record.jpg', 'Atleta rompe récord mundial en maratón.',
        'Un corredor de Kenia ha batido el récord mundial de maratón, finalizando la carrera en un tiempo sin precedentes.'),
       (8, 'Crisis Financiera', 'financial_crisis.jpg', 'Los mercados colapsan tras caída de bolsa.',
        'La bolsa de valores sufrió una de sus peores caídas en la historia reciente, lo que ha generado preocupación a nivel global.');

INSERT INTO news_categories (news_id, category_id)
VALUES (1, 1),  -- Descubrimiento en Marte → Ciencia
       (1, 9),  -- Descubrimiento en Marte → Internacional

       (2, 2),  -- Avance en IA → Tecnología

       (3, 3),  -- Revolución en Energía Solar → Energía
       (3, 6),  -- Revolución en Energía Solar → Medio Ambiente

       (4, 4),  -- Descubrimiento de Dinosaurio → Paleontología
       (4, 1),  -- Descubrimiento de Dinosaurio → Ciencia

       (5, 5),  -- Avance en Medicina → Salud

       (6, 10), -- Explosión en Planta Nuclear → Seguridad
       (6, 9),  -- Explosión en Planta Nuclear → Internacional

       (7, 7),  -- Nuevo Récord en Deporte → Deportes

       (8, 8),  -- Crisis Financiera → Economía
       (8, 9);  -- Crisis Financiera → Internacional

insert into users (username, password)
values ('abi', '$2a$10$0nm5d8a9Rp7exLsguh/I1us0SKH89MIFS6qUvyGgtilxBuK4/9e.O');