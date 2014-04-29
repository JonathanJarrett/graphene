SET ANSI_NULLS ON

 
DROP function FN_REMOVE_BAD_CHARACTER;
 
CREATE FUNCTION [FN_REMOVE_BAD_CHARACTER] (@INPUTSTR varchar(300))
RETURNS VARCHAR(300)
AS 
BEGIN
    
WITH BAD_CHARACTER AS
(
SELECT '!' as item
UNION ALL
SELECT '@' as item
UNION ALL
SELECT '#' as item
UNION ALL
SELECT '$' as item
UNION ALL 
SELECT '%' as item
UNION ALL 
SELECT '^' as item
UNION ALL 
SELECT '&' as item
UNION ALL 
SELECT '*' as item
UNION ALL 
SELECT '(' as item
UNION ALL 
SELECT ')' as item
UNION ALL 
SELECT '-' as item
UNION ALL 
SELECT '+' as item
UNION ALL 
SELECT '.' as item
UNION ALL 
SELECT ',' as item
UNION ALL 
SELECT '<' as item
UNION ALL 
SELECT '>' as item
UNION ALL 
SELECT '?' as item
UNION ALL 
SELECT '/' as item
UNION ALL 
SELECT '|' as item
UNION ALL 
SELECT '\' as item
UNION ALL 
SELECT '~' as item
UNION ALL 
SELECT ' ' as item
 )
SELECT @INPUTSTR = Replace(@INPUTSTR, ITEM, '') FROM BAD_CHARACTER  
return @INPUTSTR 
END ;

select dbo.FN_REMOVE_BAD_CHARACTER('!@#$%^^&*()d a n ')